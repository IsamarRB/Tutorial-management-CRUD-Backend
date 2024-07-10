package com.services;

import com.Repository.ITutorialRepository;
import com.model.Tutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service

public class TutorialServices {
    @Autowired
    ITutorialRepository iTutorialRepository;

    public ArrayList<Tutorial> getAllTutorial(){
        return (ArrayList<Tutorial>) iTutorialRepository.findAll();
    }
    public Tutorial createTutorial (Tutorial tutorial){
        return iTutorialRepository.save(tutorial);
    }

    public String deleteTutorial(int id) {
      try {
          iTutorialRepository.deleteById(id);
          return "Has eliminated " + id;
    } catch (Exception ignored){
          return  "There is no such Tutorial.";
      }
   }
}