package cn.paper_card.sponsorship.api;

import java.util.UUID;

@SuppressWarnings("unused")
public record SponsorshipInfo(
        int id, // 赞助ID
        UUID uuid, // 赞助玩家的UUID
        String name, // 赞助时的名称
        long money, // 赞助金额（以分为单位）
        String comment, // 赞助备注
        long time // 赞助时间
) {
}