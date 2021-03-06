package main;

import java.io.InputStream;
import java.util.Scanner;

public class Route implements Comparable{

	private int startX;
	private int startY;
	private int endX;
	private int endY;
	private int earlStart;
	private int latFinish;
	private Task task;

	public Route(){

	}

	public Route(int startX, int startY, int endX, int endY, int earlStart, int latFinish, Task task){
		this.startX = startX;
		this.startY = startY;
		this.endX = endX;
		this.endY = endY;
		this.earlStart = earlStart;
		this.latFinish = latFinish;
		this.task = task;
		toString();
	}

	public int getStartX() {
		return startX;
	}

	public void setStartX(int startX) {
		this.startX = startX;
	}

	public int getStartY() {
		return startY;
	}

	public void setStartY(int startY) {
		this.startY = startY;
	}

	public int getEndX() {
		return endX;
	}

	public void setEndX(int endX) {
		this.endX = endX;
	}

	public int getEndY() {
		return endY;
	}

	public void setEndY(int endY) {
		this.endY = endY;
	}

	public int getEarlStart() {
		return earlStart;
	}

	public void setEarlStart(int earlStart) {
		this.earlStart = earlStart;
	}

	public int getLatFinish() {
		return latFinish;
	}

	public void setLatFinish(int latFinish) {
		this.latFinish = latFinish;
	}

	public Double getCoef(){
		Double lenC = (double)(Math.abs(endX - startX) + Math.abs(endY - startY))
				/ (double)task.getMaxDistance();
		return lenC;
	}

	public String toString(){
		return "startX = " + startX +
				" startY = " + startY +
				" endX = " + endX +
				" endY = " + endY +
				" earliest start = " + earlStart +
				" latest finish = " + latFinish;
	}

	@Override
	public int compareTo(Object o) {
		return getCoef().compareTo(((Route)o).getCoef());
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}
}
