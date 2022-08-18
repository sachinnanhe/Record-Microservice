package com.rec.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.rec.entity.Record;

@Service
public class RecordServiceImpl implements IRecordService {
	
	//dummy list
    List<Record> list = List.of(
    		
    		new Record(1L,"tata@gmail.com","tata motors",1311L),
    		new Record(2L,"mahindra@gmail.com","mahindra cars",1312L),
    		new Record(3L,"cts@gmail.com","cts",1313L),
    		new Record(4L,"accenture@gmail.com","accenture",1314L),
    		new Record(5L,"wipro@gmail.com","wipro",1315L),
    		new Record(6L,"lt@gmail.com","Lt",1316L),
    		new Record(7L,"imfosys@gmail.com","imfosys",1317L),
    		new Record(8L,"suzuki@gmail.com","suzuki motors",1318L),
    		new Record(9L,"bmw@gmail.com","bmw",1319L)
    		
    		);
    
    @Override
	public List<Record> getRecordOfEmployee(Long eId) {
		// TODO Auto-generated method stub
		return list.stream().filter(record->record.geteId().equals(eId)).collect(Collectors.toList());
	}

}
