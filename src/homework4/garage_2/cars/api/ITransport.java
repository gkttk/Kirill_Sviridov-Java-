package homework4.garage_2.cars.api;

import homework4.garage_2.parts.api.engine.IEngine;
import homework4.garage_2.parts.api.lock.ILock;
import homework4.garage_2.parts.api.wheels.IWheels;

public interface ITransport {

    void go();
    void stop();
    void changeWheels(IWheels newWheels);
    void changeEngine(IEngine newEngine);
    void changeLock(ILock newLock);

    int getNumberOfWheels();
    ILock getLock();
    IEngine getEngine();
    char getLicense();
    void getData();

    void refuel();
    void openDoor();
    boolean getDoorCondition();
    void tryToStart();


}
