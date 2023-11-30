package cn.paper_card.sponsorship.api;

import java.util.UUID;

@SuppressWarnings("unused")
public record SponsorshipTopInfo(
        int no, // 排名
        String name, // 游戏名
        UUID uuid, // 玩家UUID
        long count, // 赞助次数
        long money // 总额
) {
}
