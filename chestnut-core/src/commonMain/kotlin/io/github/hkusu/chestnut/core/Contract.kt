package io.github.hkusu.chestnut.core

sealed interface Contract
interface State : Contract
interface Action : Contract
interface Event : Contract