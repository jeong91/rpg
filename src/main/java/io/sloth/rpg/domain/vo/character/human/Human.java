package io.sloth.rpg.domain.vo.character.human;

import io.sloth.rpg.domain.vo.character.Character;

public class Human extends Character {
    public Human() {
        super();
        this.setTotalHp(100);
        this.setTotalMp(100);
    }

  /*  *//**
     * 사람 종족 방어력
     *//*
    protected void tribeSkill() {
        this.defensePower += 50;
    }
*/
}
