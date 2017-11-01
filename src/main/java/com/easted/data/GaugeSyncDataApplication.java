package com.easted.data;

import com.easted.data.service.EnterpriseinfoService;
import com.easted.data.service.ProblemprocessinfoService;
import com.easted.data.service.ProcessinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.text.ParseException;

@SpringBootApplication
public class GaugeSyncDataApplication {

	@Autowired
	private ProblemprocessinfoService myproblemprocessinfoService;
	private static ProblemprocessinfoService problemprocessinfoService;

	@Autowired
	private ProcessinfoService myprocessinfoService;
	private static ProcessinfoService processinfoService;

	@Autowired
	private EnterpriseinfoService myenterpriseinfoService;
	private static EnterpriseinfoService enterpriseinfoService;

	@PostConstruct
	public void init() {
		GaugeSyncDataApplication.problemprocessinfoService = myproblemprocessinfoService;
		GaugeSyncDataApplication.processinfoService = myprocessinfoService;
		GaugeSyncDataApplication.enterpriseinfoService = myenterpriseinfoService;
	}
	@Transactional
	public static void main(String[] args) throws ParseException {
		SpringApplication.run(GaugeSyncDataApplication.class, args);
		problemprocessinfoService.syncProblemProcessInfo();
		processinfoService.syncProcessInfo();
		enterpriseinfoService.syncEnterpriseInfo();
	}
}
