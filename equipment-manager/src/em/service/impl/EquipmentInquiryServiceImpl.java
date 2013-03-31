package em.service.impl;

import java.util.ArrayList;
import java.util.List;

import em.model.Weapon;
import em.service.EquipmentInquiryService;

public class EquipmentInquiryServiceImpl implements EquipmentInquiryService {

	private List<Weapon> weapons;

	public EquipmentInquiryServiceImpl() {
		weapons = new ArrayList<Weapon>();
		weapons.add(new Weapon(1, "Short Sword", "Good"));
		weapons.add(new Weapon(2, "Longbow", "Fair"));
		weapons.add(new Weapon(3, "Dagger", "Poor"));
		weapons.add(new Weapon(4, "Leather Boots", "Fine"));
	}

	@Override
	public List<Weapon> getAllWeapons() {
		return weapons;
	}

	@Override
	public Weapon getWeaponById(int id) {
		Weapon weaponToReturn = null;
		for (Weapon w : weapons) {
			if (w.getId() == id) {
				weaponToReturn = w;
				break;
			}
		}

		return weaponToReturn;
	}

}
