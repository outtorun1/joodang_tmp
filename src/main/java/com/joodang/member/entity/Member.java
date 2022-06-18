package com.joodang.member.entity;

import com.joodang.member.constant.Gender;
import com.joodang.member.constant.Role;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "members")
@Getter @Setter @ToString
public class Member {
    @Id
    private String email;

    @Column(nullable = false)
    private String mName;

    @Column(nullable = false)
    private String mPhone;

    @Enumerated(EnumType.STRING)
    private Gender mGender;

    @Column(nullable = false)
    private String mZipcode;

    @Column(nullable = false)
    private String mAddress1;

    @Column(nullable = false)
    private String mRegion;

    @Column(nullable = false)
    private String mAddress2;

    @Column(nullable = false, columnDefinition = "date default sysdate")
    @Temporal(TemporalType.DATE)
    private Date mJoinDate = new Date();

    private int mCoupon;

    @Column(columnDefinition = "number default 0")
    private int mPoint;

    private String mRemark;

    @Enumerated(EnumType.STRING)
    private Role mRole;
}
