package io.sloth.rpg;

import io.sloth.rpg.domain.vo.character.human.Human;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@SpringBootApplication
public class RpgApplication {
    @Test
    public static void main(String[] args) {
        SpringApplication.run(RpgApplication.class, args);
        Human human = new Human();
        human.setHp(10);
        human.reSkill.useSkill(human);
        assertThat(human.getHp(), is(40.0));
       // System.out.println("hp >>> " + human.getHp());

        // 과장님께
        // 과장님,, 제가 부족함이 많아 시작부터 많이 고치고 다시하고 바꾸다보니
        // 결국 완성도가 너무 낮은 결과물이 나오게 됐습니다..
        // 하지만 지금 제출하고도 계속 끝까지는 만들어보도록 하겠습니다.
        // 죄송합니다,,


    }

}
