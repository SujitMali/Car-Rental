package com.byteBusters.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.byteBusters.dao.OwnerDao;
import com.byteBusters.dao.VehicleDao;
import com.byteBusters.model.Owner;
import com.byteBusters.model.Vehicle;

@Controller
public class OwnerController 
{
	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	Owner owner = (Owner) context.getBean("owner");
	OwnerDao ownerDao = (OwnerDao) context.getBean("ownerDao");
	Vehicle vehicle = (Vehicle) context.getBean("vehicle");
	VehicleDao vehicleDao = (VehicleDao) context.getBean("vehicleDao");
	
	/*==========================================================================================*/
	@RequestMapping("/owner-register")
	public String ownerRegister()
	{
		return "owner-register";
	}
	
	@RequestMapping("/owner-login")
	public String ownerLogin()
	{
		return "owner-login";
	}
	@RequestMapping("/owner-home")
	public String ownerHome()
	{
		return "owner-home";
	}
	
	@RequestMapping("/owner-vehicle-allocate")
	public String ownerVehicleAllocate()
	{
		return "owner-vehicle-allocate";
	}
	
	@RequestMapping("/owner-vehicle-unallocate")
	public String ownerVehicleUnallocate()
	{
		return "owner-vehicle-unallocate";
	}
	
	@RequestMapping("/owner-vehicle-add")
	public String ownerVehicleAdd()
	{
		return "owner-vehicle-add";
	}
	
	@RequestMapping("/owner-map")
	public String ownerMap()
	{
		return "owner-map";
	}
	/*==========================================================================================*/
	//owner-vehicle-(approve/pending/disapprove)
	/*==========================================================================================*/
	@RequestMapping("/owner-vehicle-approve")
	public String ownerVehicleApprove(Model model)
	{
		List<Vehicle> vehicles = vehicleDao.getAllVeh();
		List<Vehicle> veh = new ArrayList<Vehicle>();
		long cont = owner.getOwnerCont();
		for(Vehicle v : vehicles)
		{
			if(cont==v.getVehOwnerCont()&&v.getVehStatus().equals("Approved"))
			{
				veh.add(v);
			}
		}
		model.addAttribute("veh",veh);
		return "owner-vehicle-approve";
	}
	
	@RequestMapping("/owner-vehicle-pending")
	public String ownerVehiclePending(Model model)
	{
		List<Vehicle> vehicles = vehicleDao.getAllVeh();
		List<Vehicle> veh = new ArrayList<Vehicle>();
		long cont = owner.getOwnerCont();
		for(Vehicle v : vehicles)
		{
			if(cont==v.getVehOwnerCont()&&v.getVehStatus().equals("Pending"))
			{
				veh.add(v);
			}
		}
		model.addAttribute("veh",veh);
		return "owner-vehicle-pending";
	}
	
	@RequestMapping("/owner-vehicle-disapprove")
	public String ownerVehicleDisapprove(Model model)
	{
		List<Vehicle> vehicles = vehicleDao.getAllVeh();
		List<Vehicle> veh = new ArrayList<Vehicle>();
		long cont = owner.getOwnerCont();
		for(Vehicle v : vehicles)
		{
			if(cont==v.getVehOwnerCont()&&v.getVehStatus().equals("Disapproved"))
			{
				veh.add(v);
			}
		}
		model.addAttribute("veh",veh);
		return "owner-vehicle-disapprove";
	}
	/*==========================================================================================*/
	
	@RequestMapping(path="/afterOwnerRegister", method=RequestMethod.POST)
	public String afterOwnerRegister(HttpServletRequest request)
	{
		long cont = Long.parseLong(request.getParameter("ownerCont"));
		owner.setOwnerCont(cont);
		owner.setOwnerAge(request.getParameter("ownerAge"));		
		owner.setOwnerName(request.getParameter("ownerName"));
		owner.setOwnerPass(request.getParameter("ownerPass"));
		owner.setOwnerStatus("Pending");
		owner.setLat(Double.parseDouble(request.getParameter("lat")));
		owner.setLng(Double.parseDouble(request.getParameter("lng")));
		
		long i = ownerDao.addOwner(owner);
		
		if(i==cont)
		{
			System.out.println(i+" owner register successfully");
			return "owner-login";
		}
		else
		{
			return "owner-register";
		}
		
	}
	
	
	
	@RequestMapping(path="/afterOwnerLogin", method=RequestMethod.POST)
	public String afterOwnerLogin(HttpServletRequest request)
	{
		long cont = Long.parseLong(request.getParameter("ownerCont"));
		String pass = request.getParameter("ownerPass");
		owner = ownerDao.getOneOwner(cont);
		if(cont==owner.getOwnerCont()&&pass.equals(owner.getOwnerPass()) && owner.getOwnerStatus().equals("Approved"))
		{
			return "owner-home";
		}
		else
		{
			return "owner-login";
		}
	}
	
	@RequestMapping(path="/afterAddVehicle", method=RequestMethod.POST)
	public String afterAddVehicle(HttpServletRequest request)
	{
		long price = Long.parseLong(request.getParameter("vehRentPrice"));
		vehicle.setVehEndDate(request.getParameter("vehStartDate"));
		vehicle.setVehModelYear(request.getParameter("vehModelYear"));
		vehicle.setVehName(request.getParameter("vehName"));
		vehicle.setVehOwnerCont(owner.getOwnerCont());
		vehicle.setVehRenPrice(price);
		vehicle.setVehStartDate(request.getParameter("vehStartDate"));
		vehicle.setVehStatus("Pending");
		vehicle.setVehType(request.getParameter("vehType"));
		long i = vehicleDao.addVeh(vehicle);
		
			System.out.println(i+" vehicle add successfully");
			return "owner-home";
		
	}
	/*==========================================================================================*/
	@RequestMapping(path="/vehicle/{status}/{id}/{page}",method=RequestMethod.GET)
	public RedirectView vehicleChangeStatus(@PathVariable("status") String status,@PathVariable("id") long id,@PathVariable("page") String page,HttpServletRequest request)
	{
		vehicle = vehicleDao.getOneVeh(id);
		if(status.equals("pending"))
		{
			vehicle.setVehStatus("Pending");
			vehicleDao.updateVeh(vehicle);
		}
		else if(status.equals("approve"))
		{
			vehicle.setVehStatus("Approved");
			vehicleDao.updateVeh(vehicle);
		}
		else if(status.equals("disapprove"))
		{
			vehicle.setVehStatus("Disapproved");
			vehicleDao.updateVeh(vehicle);
		}
		else
		{
			vehicleDao.deleteVeh(vehicle);
		}
		
		
		RedirectView redirectView = new RedirectView();
		if(page.equals("pending"))
		{
			redirectView.setUrl(request.getContextPath()+"/owner-vehicle-pending");
		}
		else if(page.equals("approve"))
		{
			redirectView.setUrl(request.getContextPath()+"/owner-vehicle-approve");
		}
		else
		{
			redirectView.setUrl(request.getContextPath()+"/owner-vehicle-disapprove");
		}
		
		return redirectView;
	}
	/*==========================================================================================*/
	
	/*==========================================================================================*/
	/*==========================================================================================*/
}
