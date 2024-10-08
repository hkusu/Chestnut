package io.github.hkusu.tatre.core

sealed interface Contract
interface State : Contract
interface Action : Contract
interface Event : Contract