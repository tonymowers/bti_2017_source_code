package com.example.demo.features;

import com.example.demo.services.HelloService;

class ActorWhoSeesGreetings {
    private final HelloService service = new HelloService();

    public String sees_hello_greeting(String name) {
        return service.get_hello_message(name);
    }
}
