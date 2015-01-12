package com.website.Rs3Asher;

import org.powerbot.script.rt6.ClientAccessor;
import org.powerbot.script.rt6.ClientContext;

public abstract class Task extends ClientAccessor{
    public Task(ClientContext ctx) {
        super(ctx);
    }

    public abstract boolean activate();
    public abstract void execute();
    public abstract String description();
}
