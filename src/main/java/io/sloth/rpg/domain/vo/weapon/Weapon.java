package io.sloth.rpg.domain.vo.weapon;

import lombok.Data;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Data
public class Weapon {
    private String weapName; // 무기 이름
    private int attackPower; // 무기 공격력
    private int durability; // 무기 내구성
    private int intersection; // 무기 사거리

    public void setWeapName(String weapName) {
        this.weapName = weapName;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public void setIntersection(int intersection) {
        this.intersection = intersection;
    }

    public String getWeapName() {
        return weapName;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getDurability() {
        return durability;
    }

    public int getIntersection() {
        return intersection;
    }
}
