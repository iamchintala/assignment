package com.example.assignment.api.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.assignment.rewards.api.RewardsApiDelegate;
import com.example.assignment.rewards.model.Rewards;

@Service
public class RewardsApiDelegateImpl implements RewardsApiDelegate {

	@Override
	public ResponseEntity<Rewards> getRewardsByCustomerId(String customerId) {
		Rewards rewards = new Rewards();
		rewards.setCustomerId("1");
		rewards.setPurchaseAmount("100");
		rewards.setRewardPoints("123");
		return ResponseEntity.ok(rewards);
	}
}