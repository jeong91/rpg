package io.sloth.rpg.domain.vo.character.human;

import io.sloth.rpg.domain.vo.character.Character;
import io.sloth.rpg.domain.vo.skill.Skill;
import io.sloth.rpg.domain.vo.skill.human.warrior.Invincibility;

/**
 * 사람 종족 - 전사 캐릭터
 */
public class Warrior extends Character {

    private Skill specialSkill;

    public Warrior() {
        super();
        this.specialSkill = new Invincibility();
    }


}
