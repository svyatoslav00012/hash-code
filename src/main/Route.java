package main;

public class Route {

	private int startX;
	private int startY;
	private int endX;
	private int endY;
	private int earlStart;
	private int latFinish;

	public Route(){

	}

	public Route(int startX, int startY, int endX, int endY, int earlStart, int latFinish){
		this.startX = startX;
		this.startY = startY;
		this.endX = endX;
		this.endY = endY;
		this.earlStart = earlStart;
		this.latFinish = latFinish;
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

	public String toString(){
		return "startX = " + startX +
				" startY = " + startY +
				" endX = " + endX +
				" endY = " + endY +
				" earliest start = " + earlStart +
				" latest finish = " + latFinish;
	}
}