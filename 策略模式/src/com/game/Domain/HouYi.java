package com.game.Domain;

public class HouYi extends Hero {
	public HouYi() {
		super.setHeroName("后羿");
	}
	
	public void display() {
		System.out.println("觉醒吧，猎杀时刻！");
	}

	public void normalAttack() {
		System.out.println("xiuxiu~ 被动：迟缓之箭");
	}

}
