package cn.paper_card.sponsorship.api;

import java.util.UUID;

public record SponsorshipPlayerInfo(
        String name, // 名字
        UUID uuid, // UUID
        long latestTime, // 最近的一次赞助时间
        long firstTime, // 最早的一次赞助时间
        long totalMoney, // 总额
        long latestMoney, //最近一次赞助的金额
        int count // 次数
) {
}
