package org.angular.spring.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.angular.spring.example.model.Country;
import org.angular.spring.example.model.FetchResponse;
import org.angular.spring.example.model.FetchResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("MemberService")
public class FetchServiceImpl {


    @Autowired
    private CountryRepository countryRepository;

    public FetchResponseWrapper getAllMembers(String countryName, int count) {


        FetchResponseWrapper wrapper = new FetchResponseWrapper();

        List<FetchResponse> result = new ArrayList<FetchResponse>();

        Country country = countryRepository.findCountry(countryName);

        for (int i = 0; i < count; i++) {

            FetchResponse fetchResponse = new FetchResponse();
            fetchResponse.setCountryName(country.getName() + "-" + i);
            fetchResponse.setCurrency(country.getCurrency());
            fetchResponse.setPopulation(country.getPopulation() + i);
            fetchResponse.setCapital(country.getCapital() + "-" + i);
            result.add(fetchResponse);

        }

        wrapper.setFetchResponse(result);

        return wrapper;

    }


}
