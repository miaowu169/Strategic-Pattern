package com.game.Domain;

import com.game.Skill.imple.JiPao;

public class Test {
	public static void main(String[] args) {
		Hero hero = new HouYi();
		System.out.println("Ӣ�ۣ�"+hero.getHeroName()+",���ҽ���:");
		hero.display();
		hero.setIskill(new JiPao());
		System.out.println("��Ϸ��ʼ��������׼����");
		
		hero.normalAttack();
		hero.skill();
	}
}
