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

import com.byteBusters.dao.AddEmpDao;
import com.byteBusters.dao.BookingDao;
import com.byteBusters.dao.CustomerDao;
import com.byteBusters.dao.OwnerDao;
import com.byteBusters.dao.VehicleDao;
import com.byteBusters.model.AddEmp;
import com.byteBusters.model.Booking;
import com.byteBusters.model.Customer;
import com.byteBusters.model.Owner;
import com.byteBusters.model.Vehicle;

@Controller
public class CompanyController 
{
	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	AddEmp addEmp = (AddEmp) context.getBean("addEmp");
	AddEmpDao addEmpDao = (AddEmpDao) context.getBean("addEmpDao");
	OwnerDao ownerDao = (OwnerDao) context.getBean("ownerDao");
	Owner owner = (Owner) context.getBean("owner");
	Vehicle vehicle = (Vehicle) context.getBean("vehicle");
	VehicleDao vehicleDao = (VehicleDao) context.getBean("vehicleDao");
	Booking booking = (Booking) context.getBean("booking");
	BookingDao bookingDao = (BookingDao) context.getBean("bookingDao");
	Customer customer = (Customer) context.getBean("customer");
	CustomerDao customerDao = (CustomerDao) context.getBean("customerDao");
	/*========================================================================*/
	String lng2;
	String lat2;
	
	@RequestMapping("/company-home")
	public String companyHomePage()
	{
		System.out.println("company home page");
		return "company-home";
	}
	
	@RequestMapping("/company-login")
	public String loginPage()
	{
		System.out.println("company login page");
		return "company-login";
	}
	
	@RequestMapping("/company-add-emp")
	public String addEmpPage()
	{
		System.out.println("company add emp page");
		return "company-add-emp";
	}
	
	@RequestMapping("/company-owner-location")
	public String companyOwnerLocPage(Model model)
	{
		System.out.println("company add emp page");
		model.addAttribute("lat",lat2);
		model.addAttribute("lng",lng2);
		System.out.println(lat2);
		System.out.println(lng2);
		return "company-owner-location";
	}
	
	/*========================================================================*/
	//company-vehicle-(pending/approve/disapprove)
	/*========================================================================*/
	
	@RequestMapping("/company-vehicle-pending")
	public String vehiclePendingPage(Model model)
	{
		System.out.println("company vehicle pending page");
		List<Vehicle> vehicles = vehicleDao.getAllVeh();
		List<Vehicle> veh = new ArrayList<Vehicle>();
		List<Owner> owner = ownerDao.getAllOwner();
		List<Owner> owners = new ArrayList<Owner>();
		for(Owner o : owner)
		{
			if(o.getOwnerStatus().equals("Approved"))
			{
				for(Vehicle v : vehicles)
				{
					if(v.getVehStatus().equals("Pending") && o.getOwnerCont()==v.getVehOwnerCont())
					{
						veh.add(v);					
					}
				}
				owners.add(o);
			}
			
		}
		model.addAttribute("veh",veh);
		model.addAttribute("owner",owners);
		return "company-vehicle-pending";
	}
	
	@RequestMapping("/company-vehicle-approve")
	public String vehicleApprovePage(Model model)
	{
		System.out.println("company vehicle approve page");
		List<Vehicle> vehicles = vehicleDao.getAllVeh();
		List<Vehicle> veh = new ArrayList<Vehicle>();
		List<Owner> owner = ownerDao.getAllOwner();
		List<Owner> owners = new ArrayList<Owner>();
		for(Owner o : owner)
		{
			if(o.getOwnerStatus().equals("Approved"))
			{
				for(Vehicle v : vehicles)
				{
					if(v.getVehStatus().equals("Approved") && o.getOwnerCont()==v.getVehOwnerCont())
					{
						veh.add(v);					
					}
				}
				owners.add(o);
			}
			
		}
		model.addAttribute("veh",veh);
		model.addAttribute("owner",owners);
		return "company-vehicle-approve";
	}
	
	@RequestMapping("/company-vehicle-disapprove")
	public String vehicleDisapprovePage(Model model)
	{
		System.out.println("company vehicle disapprove page");
		List<Vehicle> vehicles = vehicleDao.getAllVeh();
		List<Vehicle> veh = new ArrayList<Vehicle>();
		List<Owner> owner = ownerDao.getAllOwner();
		List<Owner> owners = new ArrayList<Owner>();
		for(Owner o : owner)
		{
			if(o.getOwnerStatus().equals("Approved"))
			{
				for(Vehicle v : vehicles)
				{
					if(v.getVehStatus().equals("Disapproved") && o.getOwnerCont()==v.getVehOwnerCont())
					{
						veh.add(v);					
					}
				}
				owners.add(o);
			}
			
		}
		model.addAttribute("veh",veh);
		model.addAttribute("owner",owners);
		return "company-vehicle-disapprove";
	}
	
	/*========================================================================*/
	//company-owner-(pending/approve/disapprove)
	/*========================================================================*/
	
	@RequestMapping("/company-owner-pending")
	public String ownerPendingPage(Model model)
	{
		System.out.println("company owner pending page");
		List<Owner> owners = ownerDao.getAllOwner();
		List<Owner> owner = new ArrayList<Owner>();
		for(Owner o : owners)
		{
			if(o.getOwnerStatus().equals("Pending"))
			{
				owner.add(o);
			}
		}
		model.addAttribute("owner", owner);
		return "company-owner-pending";
	}
	
	@RequestMapping("/company-owner-approve")
	public String ownerApprovePage(Model model)
	{
		System.out.println("company owner approve page");
		List<Owner> owners = ownerDao.getAllOwner();
		List<Owner> owner = new ArrayList<Owner>();
		for(Owner o : owners)
		{
			if(o.getOwnerStatus().equals("Approved"))
			{
				owner.add(o);
			}
		}
		model.addAttribute("owner", owner);
		return "company-owner-approve";
	}
	
	@RequestMapping("/company-owner-disapprove")
	public String ownerDisapprovePage(Model model)
	{
		System.out.println("company owner disapprove page");
		List<Owner> owners = ownerDao.getAllOwner();
		List<Owner> owner = new ArrayList<Owner>();
		for(Owner o : owners)
		{
			if(o.getOwnerStatus().equals("Disapproved"))
			{
				owner.add(o);
			}
		}
		model.addAttribute("owner", owner);
		return "company-owner-disapprove";
	}
	/*========================================================================*/
	//company-booking-(pending/approve/disapprove)
	/*========================================================================*/
		
	@RequestMapping("/company-booking-pending")
	public String bookingPendingPage(Model model)
	{
		System.out.println("company booking pending page");
		List<Booking> book = bookingDao.getAllBooking();
		List<Booking> books = new ArrayList<Booking>();
		
		for(Booking b : book)
		{
			if(b.getStatus().equals("Pending"))
			{
				books.add(b);
			}
		}
		model.addAttribute("books", books);
		return "company-booking-pending";
	}
	
	@RequestMapping("/company-booking-approve")
	public String bookingApprovePage(Model model)
	{
		System.out.println("company booking approve page");
		List<Booking> book = bookingDao.getAllBooking();
		List<Booking> books = new ArrayList<Booking>();
		
		for(Booking b : book)
		{
			if(b.getStatus().equals("Approved"))
			{
				books.add(b);
			}
		}
		model.addAttribute("books", books);
		return "company-booking-approve";
	}
	
	@RequestMapping("/company-booking-disapprove")
	public String bookingDisapprovePage(Model model)
	{
		System.out.println("company booking disapprove page");
		List<Booking> book = bookingDao.getAllBooking();
		List<Booking> books = new ArrayList<Booking>();
		
		for(Booking b : book)
		{
			if(b.getStatus().equals("Disapproved"))
			{
				books.add(b);
			}
		}
		model.addAttribute("books", books);
		return "company-booking-disapprove";
	}
	
	/*========================================================================*/
	//company-booking-(todays/upcoming)
	/*========================================================================*/
		
	@RequestMapping("/company-booking-todays")
	public String bookingTodaysPage()
	{
		System.out.println("company booking todays page");
		return "company-booking-todays";
	}
	
	@RequestMapping("/company-booking-upcoming")
	public String bookingUpcomingPage()
	{
		System.out.println("company booking upcoming page");
		return "company-booking-upcoming";
	}
	
	/*========================================================================*/
	
	@RequestMapping(path="/afterCompanyAddEmp",method=RequestMethod.POST)
	public String companyAddEmp(HttpServletRequest request)
	{
		addEmp.setEmpCont(Long.parseLong(request.getParameter("empCont")));
		addEmp.setEmpName(request.getParameter("empName"));
		addEmp.setEmpStatus("offRent");
		long i = addEmpDao.addEmp(addEmp);
		System.out.println(i+" add successfully");		
		return "company-home";
	}
	
	@RequestMapping(path="/afterCompanyLogin",method=RequestMethod.POST)
	public String companyLogin(HttpServletRequest request)
	{
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		if(email.equals("admin@gmail.com")&&pass.equals("admin"))
		{
			return "company-home";
		}
		else
		{
			return "company-login";
		}
		
	}
	
	/*========================================================================*/
	@RequestMapping(path="/owner/{status}/{cont}/{page}",method=RequestMethod.GET)
	public RedirectView ownerChangeStatus(@PathVariable("status") String status,@PathVariable("cont") long cont,@PathVariable("page") String page,HttpServletRequest request)
	{
		owner = ownerDao.getOneOwner(cont);
		if(status.equals("pending"))
		{
			owner.setOwnerStatus("Pending");
			ownerDao.updateOwner(owner);
		}
		else if(status.equals("approve"))
		{
			owner.setOwnerStatus("Approved");
			ownerDao.updateOwner(owner);
		}
		else if(status.equals("disapprove"))
		{
			owner.setOwnerStatus("Disapproved");
			ownerDao.updateOwner(owner);
		}
		else
		{
			ownerDao.deleteOwner(owner);
		}
		
		
		RedirectView redirectView = new RedirectView();
		if(page.equals("pending"))
		{
			redirectView.setUrl(request.getContextPath()+"/company-owner-pending");
		}
		else if(page.equals("approve"))
		{
			redirectView.setUrl(request.getContextPath()+"/company-owner-approve");
		}
		else
		{
			redirectView.setUrl(request.getContextPath()+"/company-owner-disapprove");
		}
		
		return redirectView;
	}
	/*========================================================================*/
	@RequestMapping(path="/company/{status}/{id}/{page}",method=RequestMethod.GET)
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
			redirectView.setUrl(request.getContextPath()+"/company-vehicle-pending");
		}
		else if(page.equals("approve"))
		{
			redirectView.setUrl(request.getContextPath()+"/company-vehicle-approve");
		}
		else
		{
			redirectView.setUrl(request.getContextPath()+"/company-vehicle-disapprove");
		}
		
		return redirectView;
	}
	
	
	
	@RequestMapping(path="/booking/{status}/{id}/{page}",method=RequestMethod.GET)
	public RedirectView bookingChangeStatus(@PathVariable("status") String status,@PathVariable("id") long id,@PathVariable("page") String page,HttpServletRequest request)
	{
		booking = bookingDao.getOneBooking(id);
		if(status.equals("pending"))
		{
			booking.setStatus("Pending");
			bookingDao.updateBooking(booking);
		}
		else if(status.equals("approve"))
		{
			
			booking.setStatus("Approved");
			booking.setBookStatus("onRent");
			bookingDao.updateBooking(booking);
		}
		else if(status.equals("disapprove"))
		{
			booking.setStatus("Disapproved");
			booking.setBookStatus("offRent");
			bookingDao.updateBooking(booking);
		}
		else
		{
			bookingDao.deleteBooking(booking);
		}
		
		
		RedirectView redirectView = new RedirectView();
		if(page.equals("pending"))
		{
			redirectView.setUrl(request.getContextPath()+"/company-booking-pending");
		}
		else if(page.equals("approve"))
		{
			redirectView.setUrl(request.getContextPath()+"/company-booking-approve");
		}
		else
		{
			redirectView.setUrl(request.getContextPath()+"/company-booking-disapprove");
		}
		
		return redirectView;
	}
			
	@RequestMapping(path="/ownerLoc/{lat}/{lng}/{fake}",method=RequestMethod.GET)
	public RedirectView ownerLoc(@PathVariable("lat") String lat,@PathVariable("lng") String lng,@PathVariable("fake") String fake,HttpServletRequest request)
	{
		lat2 = lat;
		lng2 = lng;
		System.out.println("ownerloc"+lng);
		System.out.println(fake);
		RedirectView redirectView = new RedirectView();
				
		redirectView.setUrl(request.getContextPath()+"/company-owner-location");		
		
		return redirectView;
	}
	
	
}
