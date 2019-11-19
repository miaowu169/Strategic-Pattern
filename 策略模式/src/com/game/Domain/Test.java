package com.game.Domain;

import com.game.Skill.imple.JiPao;

public class Test {
	public static void main(String[] args) {
		Hero hero = new HouYi();
		System.out.println("英雄："+hero.getHeroName()+",自我介绍:");
		hero.display();
		hero.setIskill(new JiPao());
		System.out.println("游戏开始，请做好准备！");
		
		hero.normalAttack();
		hero.skill();
	}
}
