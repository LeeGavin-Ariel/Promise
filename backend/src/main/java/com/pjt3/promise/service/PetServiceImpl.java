package com.pjt3.promise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjt3.promise.entity.Pet;
import com.pjt3.promise.entity.User;
import com.pjt3.promise.repository.PetRepository;
import com.pjt3.promise.repository.UserRepository;
import com.pjt3.promise.request.UserInsertPostReq;

@Service
public class PetServiceImpl implements PetService{

	@Autowired
	UserService userService;
	
	@Autowired
	PetRepository petRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public int increasePetExp(int petExp, User user) {
		try {
			Pet pet = petRepository.findPetByUser(user);
			
			// 경험치 증가
			int incExp = pet.getPetExp() + petExp;
			pet.setPetExp(incExp);
			
			// 경험치 점수에 따른 레벨 변경
			if(incExp >= 3) {
				pet.setPetLevel(2);
			} else if(incExp >= 6) {
				pet.setPetLevel(3);
			} else if(incExp >= 9){
				pet.setPetLevel(4);
			} else {
			}
			
			petRepository.save(pet);
			
			return 1;
		} catch(Exception e) {
			return -1;
		}
	}
		
	@Override
	public Pet insertPet(UserInsertPostReq userInsertInfo) {
		Pet pet = new Pet();
		User user = userService.getUserByUserEmail(userInsertInfo.getUserEmail());
		
		pet.setUser(user);
		pet.setPetName(userInsertInfo.getPetName());
		pet.setPetType(userInsertInfo.getPetType());
		
		return petRepository.save(pet);

	}	

}
