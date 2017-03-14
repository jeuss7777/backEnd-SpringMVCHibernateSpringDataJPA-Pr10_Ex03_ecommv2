package com.jarana.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jarana.entities.PoDetail;
import com.jarana.service.PoDetailService;

@Controller
@RequestMapping("/podetail")
public class PoDetailController { 

	@Autowired
	private PoDetailService podetailService;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<PoDetail> findAll() {
		return podetailService.findAll();
	}

//	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
//	@ResponseBody
//	public PoDetail find(@PathVariable("id") Type id) {
//		return podetailService.findOne(id);
//	}

//	@RequestMapping(value = "/WISHED_FIELD_NAME/{FIELD}", method = RequestMethod.GET)
//	@ResponseBody
//	public List<PoDetail> findBy-ReplaceFIELD(@PathVariable("FIELD") TYPE FIELD) {
//		return podetailService.findBy-ReplaceFIELD(FIELD);
//	}

	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public void create(@RequestBody PoDetail podetail) {
		podetailService.create(podetail);
	}

	@RequestMapping(value = "/edit", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public void update(@RequestBody PoDetail podetail) {
		podetailService.update(podetail);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	@ResponseBody
	public void delete(@RequestBody PoDetail podetail) {
		podetailService.delete(podetail);
	}

}
