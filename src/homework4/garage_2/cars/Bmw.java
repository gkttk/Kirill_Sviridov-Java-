package homework4.garage_2.cars;
import homework4.garage_2.enums.*;
import homework4.garage_2.parts.*;

public class Bmw extends Car {
   private final TypeOfKey key = TypeOfKey.KEY_BMW;//тип ключа

    //конструкторы
   public Bmw() {
       super("BMW",4);
   }//создание базовой сборки БМВ с дефолтными характеристиками без двигателя и колес

   public Bmw(String id, int numberOfSeats, Engine engine, Wheels wheels){
       super(id, numberOfSeats);
       this.engine = engine;
       this.wheels = wheels;
    }//создание модели БМВ с заданными клиентом параметрами + созданным двигателем и колесами


    //двигатель
    @Override
    public void changeEngine() {
       engine = new Engine();
    }//замена на базовый двигатель

    public void changeEngine(String id, double capacity, TypeOfFuel type) {
        engine = new Engine(id, capacity, type);
    }//сборка нового двигателя с заданными характеристиками

    public void changeEngine(Engine engine) {
        this.engine = new Engine(engine);
    }//замена двигателя на готовый двигатель


    //колеса
    @Override
    public void changeWheels() {
        wheels = new Wheels();
    }//замена на базовые колеса

    public void changeWheels(String id, double radius, TypeOfWheels type) {
        wheels = new Wheels(id, radius, type);
    }//сборка колес с нужными характеристиками

    public void changeWheels(Wheels wheels) {
        this.wheels = new Wheels(wheels);
    }//замена колес на готовые



    @Override
    public void open(TypeOfKey key) {
        if(isOpen){
            System.out.println("BMW уже открыт...");
        }
        else if(this.key == key){
            System.out.println("Открываю BMW...");
            isOpen = true;
        }
        else{
            System.out.println("Ключ не подходит...");
        }

    }// открывает BMW(проверка на ключ, при передаче без параметров, метод суперкласса выдает сообщение)








}
