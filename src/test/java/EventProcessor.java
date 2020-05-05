import me.zero.alpine.fork.listener.EventHandler;
import me.zero.alpine.fork.listener.Listenable;
import me.zero.alpine.fork.listener.Listener;

public class EventProcessor implements Listenable {

    @EventHandler
    private Listener<String> stringListener = new Listener<>(str -> {
        System.out.println(str);
    }, new LengthOf3Filter());
}
