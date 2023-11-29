package com.project.library.entity;


import com.project.library.constant.Role;
import com.project.library.dto.MemberDTO;
import lombok.*;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="member")
public class Member {

    @Id
    @Column(name="member_id")
    private String memberId; // 아이디

    private String memberName; //이름

    private String memberPswd; //비밀번호

    private String memberAge; //생년월일

    private String memberAddress; //주소

    private String memberPhone; //전화번호

    private int bookRentalCount; //대여 횟수

    private int studyRentalCount; //학습실 이용 횟수

    private String memberDate;  //가입 날짜

    @Enumerated(EnumType.STRING)
    private Role role;  //권한

    public static Member createMember(MemberDTO memberDTO, PasswordEncoder passwordEncoder){

        Member member = new Member();
        member.setMemberId(memberDTO.getMemberId());
        member.setMemberName(memberDTO.getMemberName());
        member.setMemberPhone(memberDTO.getMemberPhone());
        member.setMemberAddress(memberDTO.getMemberAddress());
        member.setMemberAge(memberDTO.getMemberAge());
        member.setBookRentalCount(memberDTO.getBookRentalCount());
        member.setStudyRentalCount(memberDTO.getStudyRentalCount());
        member.setMemberDate(memberDTO.getMemberDate());

        member.setRole(Role.USER);

        // 암호화
        String password = passwordEncoder.encode(memberDTO.getMemberPswd());
        member.setMemberPswd(password);

        return member;
    }



}







