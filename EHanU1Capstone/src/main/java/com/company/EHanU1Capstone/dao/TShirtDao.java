package com.company.EHanU1Capstone.dao;

import com.company.EHanU1Capstone.model.Console;
import com.company.EHanU1Capstone.model.Game;
import com.company.EHanU1Capstone.model.TShirt;

import java.util.List;

public interface TShirtDao {

    TShirt addTShirt(TShirt tShirt);

    TShirt getTShirt(int TShirtID);

    List<TShirt> getAllTShirts();

    TShirt updateTShirt(TShirt tShirt);

    void deleteTShirt(int TShirtID);

    List<TShirt>gettShirtByColor(String color);

    List<TShirt>gettShirtBySize(String size);



}
