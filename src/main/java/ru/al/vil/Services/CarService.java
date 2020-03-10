package ru.al.vil.Services;

import org.springframework.stereotype.Service;
import ru.al.vil.Interfaces.CarInterface;

@Service()

public class CarService implements CarInterface {
    @Override
    public String get(String x, String y) {
        return x+""+y;
    }



    @Override
    public Integer put(int x, int y) {
        return x+y;
    }

    @Override
    public String post(String x, String y) {
        return x+" "+y;
    }

    @Override
    public String del() {
        return null;
    }
}
