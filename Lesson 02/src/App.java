import Classes.Actor;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;
import Classes.TaxInspector;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        // Создаем объект магазина с именем "magnit".
        Market magnit = new Market();

        // Создаем обычных клиентов (Actors) с именами "boris" и "masha".
        Actor client1 = new OrdinaryClient("boris");
        Actor client2 = new OrdinaryClient("masha");

        // Создаем специального клиента с именем "prezident" и уровнем доступа 1.
        Actor client3 = new SpecialClient("prezident", 1);

        // Создаем тайного покупателя
        iActorBehaviour client4 = new TaxInspector();


        // Вход клиентов в магазин, вызывая метод acceptToMarket у объекта magnit.
        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);


        // Обновляем состояние рынка, вызывая метод update у объекта magnit.
        magnit.update();
    }
}