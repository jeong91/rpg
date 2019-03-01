package io.sloth.rpg.domain.vo.skill.human.warrior;

import io.sloth.rpg.domain.vo.character.Character;
import io.sloth.rpg.domain.vo.skill.Skill;
import org.springframework.stereotype.Component;

@Component
public class Invincibility extends Skill {
    public Invincibility() {
        super();
        this.mp = 100;
        this.cooltime = 50000;
    }

    @Override
    public void useSkill(Character ch) {
        System.out.println("전사 10초 무적 스킬 사용!");

    }
}
