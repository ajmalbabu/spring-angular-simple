package org.angular.spring.controller;

import java.util.List;

import org.angular.spring.example.model.FetchRequest;
import org.angular.spring.example.model.FetchResponse;
import org.angular.spring.example.model.FetchResponseWrapper;
import org.angular.spring.service.FetchServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/members")
public class FetchController {

    @Autowired
    private FetchServiceImpl membersService;

    @RequestMapping(value = "/retrieve", method = RequestMethod.POST)
    public
    @ResponseBody
    FetchResponseWrapper retrieve(@RequestBody FetchRequest fetchRequest) {

        // TODO Use Google Guava to calculate time taken

        System.out.println("Retrieve the list for: " + fetchRequest);
        double startTime = System.currentTimeMillis();

        System.out.println("Back-end, start time: " + startTime);

        FetchResponseWrapper response = membersService.getAllMembers("Spain", fetchRequest.getCount());


        double endtime = System.currentTimeMillis();

        System.out.println("Back-end, end time: " + endtime);

        Double backendTime = (Double)((endtime - startTime) / (double)1000);

        response.setBackEndTime(backendTime.toString());

        System.out.println("Back end time: " + backendTime);
        System.out.println("Back end time: " + response.getBackEndTime());

        return response;
    }

    @RequestMapping("/layout")
    public String getMemberPartialPage(ModelMap modelMap) {
        System.out.println("return layout");
        return "members/layout";
    }
}
