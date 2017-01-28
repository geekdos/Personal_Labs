package app;

import msg.Message;
import msg.MessengerOperations;

import java.util.HashMap;
import java.util.Map;

public class MessengerImpl implements MessengerOperations {
    private static int id = 0;
    private Map<Integer, Message> map = new HashMap();

    @Override
    public int signup() {
        return id++;
    }

    @Override
    public void submit(int id, Message msg) {
        map.put(id, msg);
    }

    @Override
    public Message consult(int id) {
        if (map.get(id) != null)
            return map.get(id);
        return null;
    }
}
