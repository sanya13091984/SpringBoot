package ru.al.vil.Services;

import org.springframework.stereotype.Service;
import ru.al.vil.Interfaces.CarInterface;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService implements CarInterface {


    @Override
    public Integer cet(int x, int y) {
        return x*y;
    }

    @Override
    public String put(String x, String y) {
        return x+" "+y;
    }

    @Override
    public Integer post(int a, int b) {
        return a*b;
    }

    @Override
    public String del() {
        return null;
    }


}
