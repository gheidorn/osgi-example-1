package em.service;

import java.util.List;

import em.model.Weapon;

public interface EquipmentInquiryService {
	/**
	 * 
	 * @param id
	 * @return
	 */
	Weapon getWeaponById(int id);
	
	/**
	 * 
	 * @return
	 */
	List<Weapon> getAllWeapons();
}
