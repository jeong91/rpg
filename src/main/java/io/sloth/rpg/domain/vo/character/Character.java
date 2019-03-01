package io.sloth.rpg.domain.vo.character;

import io.sloth.rpg.domain.vo.skill.Skill;
import io.sloth.rpg.domain.vo.skill.human.common.Recorvery;
import io.sloth.rpg.domain.vo.weapon.Weapon;

public abstract class Character {
    private int level = 1; // 레벨
    private double totalHp; // 최대 생명력
    private double totalMp; // 최대 마나
    private double hp = this.getTotalHp(); // 현재 생명력
    private double mp = this.getTotalMp(); // 스킬사용 시 필요한 에너지
    private int live = 0; // 생존 0, 죽음 1
    private String tribe; // 종족
    private String job = "백수"; // 직업
    private double attackPower; // 공격력
    private double defensePower; // 방어력
    private Weapon weapon; // 무기
    public Recorvery reSkill = new Recorvery(); // 회복스킬
    private Skill berSkill; // 버스커스킬(방어력 20%감소, 공격력 30% 상승)
    private Skill tribeSkill; // 종족스킬
    private Skill jobSkill; // 직업스킬
    private int attackCount = 0;

    public double getTotalHp() {
        return totalHp;
    }

    public void setTotalHp(double totalHp) {
        this.totalHp = totalHp;
    }

    public double getTotalMp() {
        return totalMp;
    }

    public void setTotalMp(double totalMp) {
        this.totalMp = totalMp;
    }

    private void attack(){

        if (weapon.getDurability() <= 0){
            System.out.println("현재 무기로 공격 불가능...");
        } else {
            if (attackCount % 100 == 0) {
                weapon.setDurability(weapon.getDurability() - 1);
            }
            attackCount += 1;
            System.out.println("공격!");
        }
    }

    public Skill getTribeSkill() {
        return tribeSkill;
    }

    public void setTribeSkill(Skill tribeSkill) {
        this.tribeSkill = tribeSkill;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getMp() {
        return mp;
    }

    public void setMp(double mp) {
        this.mp = mp;
    }
/*   // TODO: Skill Static Class 로 변경
    private void recovery(){
        // TODO Skill init
        hp += skill.recovery(this.hp);
    }

    private void berserker(){
        // TODO: Skill init
        Map<String, Double> map = new HashMap<>();
        map.put("ap", this.attackPower);
        map.put("dp", this.defensePower);
        map = skill.berserker(map);
        this.attackPower = map.get("ap");
        this.defensePower = map.get("dp");
    }*/
}
