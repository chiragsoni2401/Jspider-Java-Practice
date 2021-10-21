package com.om.hibernate.util;

import com.om.hibernate.dao.WeaponDAO;
import com.om.hibernate.dto.WeaponDTO;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WeaponDTO weaponDTO = new WeaponDTO();
		
		weaponDTO.setWid(1);
		weaponDTO.setType("AK-47");
		weaponDTO.setPrice(5000);
         weaponDTO.setModel("akka");
         weaponDTO.setRange(34);
         
         WeaponDAO weaponDAO = new WeaponDAO();
         weaponDAO.save(weaponDTO);
	}

}
