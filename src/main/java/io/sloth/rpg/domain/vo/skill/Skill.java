package io.sloth.rpg.domain.vo.skill;

import com.sun.xml.internal.bind.v2.TODO;
import io.sloth.rpg.domain.vo.character.Character;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Data
public abstract class Skill {
    protected double mp; // 스킬 사용을 위한 필요 mp
    protected double cooltime; // 쿨타임(재사용 시간)

    public double getMp() {
        return mp;
    }

    public void setMp(double mp) {
        this.mp = mp;
    }

    public double getCooltime() {
        return cooltime;
    }

    public void setCooltime(double cooltime) {
        this.cooltime = cooltime;
    }

    public Skill() {}

    public abstract void useSkill(Character ch);

    // TODO: io.sloth.rpg.domain.vo.skill.common 으로 이동
    /**
     * 버서커 - 공격력 30% 상승 및 방어력 20% 저하
     *
     * @param map
     * @return
     */
    public Map<String, Double> berserker(Map<String, Double> map){

        Double ap = map.get("ap"); // 공격력
        Double dp = map.get("dp"); // 방어력
        map.put("ap", ap + (ap * 0.3));
        map.put("dp", dp - (dp * 0.2));
        return map;
    }

}
