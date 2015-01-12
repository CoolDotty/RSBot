package com.website.Rs3Asher;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;

import org.powerbot.script.PollingScript;
import org.powerbot.script.rt6.ClientContext;
import org.powerbot.script.rt6.Game;
import org.powerbot.script.*;

@Script.Manifest(name = "Asher", description = "Turns logs into ashes", properties = "topic=90210;client=6;") //you need this
public class Asher extends PollingScript<ClientContext> implements PaintListener{

	private ArrayList<Task> tasks = new ArrayList<Task>();
	
	@Override
	public void start() {
	}
	
	@Override
	public void poll() {
		currentAction = "Idle";
		for(Task t : tasks) {
			if(t.activate()) {
				currentAction = t.description();
				t.execute();
			}
		}
	}
	
	private Font font = new Font("Verdana", Font.PLAIN, 12);
	private String currentAction = "";
	
	@Override
	public void repaint(Graphics g) {
		
		g.setColor(Color.WHITE);
		g.setFont(font);
		g.drawString(currentAction, 247, 371);
	}
}
//Start: (1717, 5606) -> (1717, 5597)
//Bank: (1704, 5599)
// "Ashes" "Willow logs" "Fire"