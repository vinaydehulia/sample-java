package com.dehulia.springjwt.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
  @GetMapping("/all")
  public String allAccess() {
    return "Public Content.";
  }

  @GetMapping("/user")
  @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
  public String userAccess() {
    return "User Content.";
  }

  @GetMapping("/mod")
  @PreAuthorize("hasRole('MODERATOR')")
  public String moderatorAccess() {
    return "Moderator Board.";
  }

  @GetMapping("/admin")
  @PreAuthorize("hasRole('ADMIN')")
  public String adminAccess() {
	  
    return    "   {  \n"
    		+ "      name:'arun',\n"
    		+ "      gender:'Male',\n"
    		+ "      physics:88,\n"
    		+ "      maths:87,\n"
    		+ "      english:78\n"
    		+ "   },\n"
    		+ "   {  \n"
    		+ "      name:'rajesh',\n"
    		+ "      gender:'Male',\n"
    		+ "      physics:96,\n"
    		+ "      maths:100,\n"
    		+ "      english:95\n"
    		+ "   },\n"
    		+ "   {  \n"
    		+ "      name:'moorthy',\n"
    		+ "      gender:'Male',\n"
    		+ "      physics:89,\n"
    		+ "      maths:90,\n"
    		+ "      english:70\n"
    		+ "   },\n"
    		+ "   {  \n"
    		+ "      name:'raja',\n"
    		+ "      gender:'Male',\n"
    		+ "      physics:30,\n"
    		+ "      maths:25,\n"
    		+ "      english:40\n"
    		+ "   },\n"
    		+ "   {  \n"
    		+ "      name:'usha',\n"
    		+ "      gender:'Female',\n"
    		+ "      physics:67,\n"
    		+ "      maths:45,\n"
    		+ "      english:78\n"
    		+ "   },\n"
    		+ "   {  \n"
    		+ "      name:'priya',\n"
    		+ "      gender:'Female',\n"
    		+ "      physics:56,\n"
    		+ "      maths:46,\n"
    		+ "      english:78\n"
    		+ "   },\n"
    		+ "   {  \n"
    		+ "      name:'Sundar',\n"
    		+ "      gender:'Male',\n"
    		+ "      physics:12,\n"
    		+ "      maths:67,\n"
    		+ "      english:67\n"
    		+ "   },\n"
    		+ "   {  \n"
    		+ "      name:'Kavitha',\n"
    		+ "      gender:'Female',\n"
    		+ "      physics:78,\n"
    		+ "      maths:71,\n"
    		+ "      english:67\n"
    		+ "   },\n"
    		+ "   {  \n"
    		+ "      name:'Dinesh',\n"
    		+ "      gender:'Male',\n"
    		+ "      physics:56,\n"
    		+ "      maths:45,\n"
    		+ "      english:67\n"
    		+ "   },\n"
    		+ "   {  \n"
    		+ "      name:'Hema',\n"
    		+ "      gender:'Female',\n"
    		+ "      physics:71,\n"
    		+ "      maths:90,\n"
    		+ "      english:23\n"
    		+ "   },\n"
    		+ "   {  \n"
    		+ "      name:'Gowri',\n"
    		+ "      gender:'Female',\n"
    		+ "      physics:100,\n"
    		+ "      maths:100,\n"
    		+ "      english:100\n"
    		+ "   },\n"
    		+ "   {  \n"
    		+ "      name:'Ram',\n"
    		+ "      gender:'Male',\n"
    		+ "      physics:78,\n"
    		+ "      maths:55,\n"
    		+ "      english:47\n"
    		+ "   },\n"
    		+ "   {  \n"
    		+ "      name:'Murugan',\n"
    		+ "      gender:'Male',\n"
    		+ "      physics:34,\n"
    		+ "      maths:89,\n"
    		+ "      english:78\n"
    		+ "   },\n"
    		+ "   {  \n"
    		+ "      name:'Jenifer',\n"
    		+ "      gender:'Female',\n"
    		+ "      physics:67,\n"
    		+ "      maths:88,\n"
    		+ "      english:90\n"
    		+ "   }";
  }
}
