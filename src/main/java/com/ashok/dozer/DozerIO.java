package com.ashok.dozer;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Ashok Kumar
 */
public class DozerIO {
    Logger logger = LoggerFactory.getLogger(DozerMain.class);
    public static void main(String... args) {
        DozerMain dozerMain = new DozerMain();
        dozerMain.sampelDozenMapper();

    }
}

class DozerMain {
    void sampelDozenMapper() {
        SourceDTO sourceDTO = new SourceDTO();
        sourceDTO.setAge(23L);
        sourceDTO.setName("Ash");
        sourceDTO.setEmployee(true);
        System.out.println(sourceDTO.toString());
        Mapper mapper = new DozerBeanMapper();
        System.out.println(mapper.map(sourceDTO, DestinationDTO.class));
    }
}
