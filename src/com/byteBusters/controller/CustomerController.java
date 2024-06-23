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

import com.byteBusters.dao.BookingDao;
import com.byteBusters.dao.CustomerDao;
import com.byteBusters.dao.OwnerDao;
import com.byteBusters.dao.VehicleDao;
import com.byteBusters.model.Booking;
import com.byteBusters.model.Customer;
import com.byteBusters.model.Owner;
import com.byteBusters.model.Vehicle;

@Controller
public class CustomerController
{
	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	Customer customer = (Customer) context.getBean("customer");
	CustomerDao customerDao = (CustomerDao) context.getBean("customerDao");
	Vehicle vehicle = (Vehicle) context.getBean("vehicle");
	VehicleDao vehicleDao = (VehicleDao) context.getBean("vehicleDao");
	Booking booking = (Booking) context.getBean("booking");
	BookingDao bookingDao = (BookingDao) context.getBean("bookingDao");
	Owner owner = (Owner) context.getBean("owner");
	OwnerDao ownerDao = (OwnerDao) context.getBean("ownerDao");
	/*===========================================================================*/
	@RequestMapping("/cust-register")
	public String custRegisterPage()
	{
		return "cust-register";
	}
	
	@RequestMapping("/cust-login")
	public String custLoginPage()
	{
		return "cust-login";
	}
	
	@RequestMapping("/cust-home")
	public String custHomePage()
	{
		return "cust-home";
	}
	
	@RequestMapping("/cust-rating")
	public String custRatingPage()
	{
		return "cust-rating";
	}
	
	@RequestMapping("/cust-qr")
	public String custQrPage()
	{
		return "cust-qr";
	}
	
	@RequestMapping("/cust-destination")
	public String custDestPage()
	{
		return "cust-destination";
	}
	
	
	
	@RequestMapping("/cust-orders")
	public String custOrdersPage(Model model)
	{
		List<Booking> books = bookingDao.getAllBooking();
		List<Booking> book =  new ArrayList<Booking>();
		for(Booking b : books)
		{
			if(b.getCustCont()==customer.getCustCont() && b.getStatus().equals("Approved")&& b.getBookStatus().equals("return"))
			{
				book.add(b);
			}
		}
		model.addAttribute("book", book);
		return "cust-orders";
	}
	
	@RequestMapping("/cust-select-date")
	public String custSelectDatePage()
	{
		return "/cust-select-date";
	}
	
	@RequestMapping("/cust-vehicles")
	public String custVehiclesPage(Model model)
	{
		List<Vehicle> veh = vehicleDao.getAllVeh();
		List<Vehicle> vehs = new ArrayList<Vehicle>();
		for(Vehicle v : veh)
		{
			if(v.getVehStatus().equals("Approved"))
			{
				vehs.add(v);
			}
		}
		model.addAttribute("veh",vehs);
		return "cust-vehicles";
	}

	/*===========================================================================*/
	//cust-booking-(pending/approve/disapprove)
	/*===========================================================================*/
	@RequestMapping("/cust-booking-approve")
	public String custBookingApprovePage(Model model)
	{
		List<Booking> books = bookingDao.getAllBooking();
		List<Booking> book =  new ArrayList<Booking>();
		for(Booking b : books)
		{
			if(b.getCustCont()==customer.getCustCont() && b.getStatus().equals("Approved")&& b.getBookStatus().equals("onRent"))
			{
				book.add(b);
			}
		}
		model.addAttribute("book", book);
		return "cust-booking-approve";
	}
	
	@RequestMapping("/cust-booking-disapprove")
	public String custBookingDisapprovePage(Model model)
	{
		List<Booking> books = bookingDao.getAllBooking();
		List<Booking> book =  new ArrayList<Booking>();
		for(Booking b : books)
		{
			if(b.getCustCont()==customer.getCustCont() && b.getStatus().equals("Disapproved") && b.getBookStatus().equals("offRent"))
			{
				book.add(b);
			}
		}
		model.addAttribute("book", book);
		return "cust-booking-disapprove";
	}
	
	@RequestMapping("/cust-booking-pending")
	public String custBookingPendingPage(Model model)
	{
		List<Booking> books = bookingDao.getAllBooking();
		List<Booking> book =  new ArrayList<Booking>();
		for(Booking b : books)
		{
			if(b.getCustCont()==customer.getCustCont() && b.getStatus().equals("Pending")&& b.getBookStatus().equals("offRent"))
			{
				book.add(b);
			}
		}
		model.addAttribute("book", book);
		return "cust-booking-pending";
	}
	/*===========================================================================*/
	@RequestMapping(path="/afterCustomerRegister",method=RequestMethod.POST)
	public String afterCustomerRegister(Model model, HttpServletRequest request)
	{
		long cont = Long.parseLong(request.getParameter("custCont"));
		customer.setCustCont(cont);
		customer.setCustAge(request.getParameter("custAge"));
		customer.setCustLoc(request.getParameter("custLoc"));
		customer.setCustName(request.getParameter("custName"));
		customer.setCustPass(request.getParameter("custPass"));
		long i = customerDao.addCust(customer);
		if(i==cont)
		{
			model.addAttribute("customer",customer);
			System.out.println(i+" customer register successfully");
			return "cust-login";
		}
		else
		{
			return "cust-register";
		}
	}
	
	@RequestMapping(path="/afterCustomerLogin",method=RequestMethod.POST)
	public String afterCustomerLogin(HttpServletRequest request)
	{
		long cont = Long.parseLong(request.getParameter("custCont"));
		String pass = request.getParameter("custPass");
		customer  = customerDao.getOneCust(cont);
		if(cont==customer.getCustCont() && pass.equals(customer.getCustPass()))
		{
			return "cust-home";
		}
		else
		{
			return "cust-login";
		}
	}
	
	@RequestMapping(path="/afterRating",method=RequestMethod.POST)
	public String afterRating(HttpServletRequest request)
	{		
		String rating =  request.getParameter("rating");
		booking.setRating(rating);
		System.out.println(booking);
		bookingDao.updateBooking(booking);
		return "cust-booking-approve";
	}
	
	@RequestMapping(path="/afterSelectDate",method=RequestMethod.POST)
	public String afterSelectDate(Model model,HttpServletRequest request)
	{
		owner = ownerDao.getOneOwner(vehicle.getVehOwnerCont());
		
		String date = request.getParameter("date");
		booking.setDate(date);
		booking.setBookStatus("offRent");
		booking.setCustCont(customer.getCustCont());
		booking.setEmpCont(0);
		booking.setOwnerCont(owner.getOwnerCont());
		booking.setRating("0");
		booking.setStatus("Pending");
		booking.setVehNo(vehicle.getVehNo());
		booking.setCustlat(0);
		booking.setCustlng(0);
		booking.setCustName(customer.getCustName());
		booking.setVehName(vehicle.getVehName());
		booking.setVehType(vehicle.getVehType());
		
		long i = bookingDao.addBooking(booking);
		System.out.println(i+" booking successfully");
		List<Vehicle> veh = vehicleDao.getAllVeh();
		List<Vehicle> vehs = new ArrayList<Vehicle>();
		for(Vehicle v : veh)
		{
			if(v.getVehStatus().equals("Approved"))
			{
				vehs.add(v);
			}
		}
		model.addAttribute("veh",vehs);
		return "cust-vehicles";

	}
	/*===========================================================================*/
	@RequestMapping(path="/book/{id}",method=RequestMethod.GET)
	public RedirectView custDate(@PathVariable("id") long id,HttpServletRequest request)
	{
		vehicle = vehicleDao.getOneVeh(id);
		
		RedirectView redirectView = new RedirectView();
		
		redirectView.setUrl(request.getContextPath()+"/cust-select-date");
			
		return redirectView;
	}
	
	@RequestMapping(path="/booking/{page}/{id}",method=RequestMethod.GET)
	public RedirectView custDate(@PathVariable("page") String page,@PathVariable("id") long id,HttpServletRequest request)
	{
		booking = bookingDao.getOneBooking(id);		
		RedirectView redirectView = new RedirectView();
		if(page.equals("pending"))
		{
			bookingDao.deleteBooking(booking);
			redirectView.setUrl(request.getContextPath()+"/cust-booking-approve");
		}
		else if(page.equals("return"))
		{
			booking.setBookStatus("return");
			System.out.println("return");
			bookingDao.updateBooking(booking);
				
			redirectView.setUrl(request.getContextPath()+"/cust-qr");
		}
		else
		{
			bookingDao.deleteBooking(booking);
			redirectView.setUrl(request.getContextPath()+"/cust-booking-disapprove");
		}
		
		
		return redirectView;
	}
	/*===========================================================================*/
	
}
