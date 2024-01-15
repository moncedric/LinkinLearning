package com.mon.learningspring.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mon.learningspring.business.ReservationService;
import com.mon.learningspring.data.Guest;

@Controller
@RequestMapping("/guests")
public class GuestController {
	
	private final ReservationService reservationService;

	public GuestController( ReservationService reservationService) {
		this.reservationService = reservationService;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String getGuestList(Model model) {
		List<Guest> allGuest = this.reservationService.getGuestList();
		model.addAttribute("allGuest", allGuest);
		return "guests";
	}
	
}
