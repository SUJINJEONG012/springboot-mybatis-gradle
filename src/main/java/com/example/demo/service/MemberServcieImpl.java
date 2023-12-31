package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Member;
import com.example.demo.repository.MemberRepository;

@Service
public class MemberServcieImpl implements MemberService {
	
	@Autowired
	private MemberRepository memberRepository;

	@Override
	public List<Member> getMemberList() {
		return memberRepository.getMemberList();
	}
	
}
