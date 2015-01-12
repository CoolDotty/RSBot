package com.website.Rs3Asher;

import org.powerbot.script.rt6.ClientContext;

public class Burning extends Task {

	public Burning(ClientContext ctx) {
		super(ctx);
	}

	@Override
	public boolean activate() {
		if(!ctx.backpack.select().id(1519).isEmpty()) {
			return true;
		}
		return false;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub

	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return null;
	}

}
