package io.sloth.rpg.domain.vo.skill.human.common;

import io.sloth.rpg.domain.vo.character.Character;
import io.sloth.rpg.domain.vo.skill.Skill;
import org.junit.Test;

public class Recorvery extends Skill {

    public Recorvery(){
        super();
        this.setMp(30);
        this.setCooltime(30);
    }

    @Test
    @Override
    public void useSkill(Character ch) {
        System.out.println("회복 스킬 사용!");
        ch.setHp(ch.getHp() + 30);

        if (ch.getHp() > ch.getTotalHp()){
            ch.setHp(ch.getTotalHp());
        }
    }

    private static class ReHolder {
        public static final Recorvery INSTANCE = new Recorvery();
    }

    public static Recorvery getInstance(){
        return ReHolder.INSTANCE;
    }
}
