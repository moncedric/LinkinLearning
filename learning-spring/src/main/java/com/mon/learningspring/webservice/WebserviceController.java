package com.mon.learningspring.webservice;

import java.util.Date;
import java.util.List;

import javax.persistence.PostLoad;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mon.learningspring.business.ReservationService;
import com.mon.learningspring.business.RoomReservation;
import com.mon.learningspring.data.Guest;
import com.mon.learningspring.data.Room;
import com.mon.learningspring.util.DateUtils;


@RestController
@RequestMapping("/api")
public class WebserviceController {
	private final DateUtils dateUtils;
	private final ReservationService reservationService;
	
	public WebserviceController(DateUtils dateUtils, ReservationService reservationService) {
		this.dateUtils = dateUtils;
		this.reservationService = reservationService;
	}
	
	@RequestMapping(path="/reservations", method = RequestMethod.GET)
	public List<RoomReservation> getReservations(@RequestParam(value="date", required = false) String dateString){
		Date date = this.dateUtils.createDateFromDateString(dateString);
		return this.reservationService.getRoomReservationForDate(date);
	}

	@RequestMapping(path="/rooms", method = RequestMethod.GET)
	public List<Room> getRooms(){
		return this.reservationService.getRooms();
	}
	
	@RequestMapping(path="/guests", method = RequestMethod.GET)
	public List<Guest> getGuests(){
		return this.reservationService.getGuestList();
	}
	
	@PostMapping("/guests")
	@ResponseStatus(HttpStatus.CREATED)
	public void addGuest(@RequestBody Guest guest) {
		this.reservationService.addGuest(guest);
	}
}
