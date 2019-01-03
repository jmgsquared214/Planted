package com.gammel.app.security;

import com.gammel.backend.data.entity.User;

@FunctionalInterface
public interface CurrentUser {

	User getUser();
}
