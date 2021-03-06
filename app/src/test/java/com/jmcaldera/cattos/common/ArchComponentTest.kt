package com.jmcaldera.cattos.common

import android.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Rule

abstract class ArchComponentTest : UnitTest() {
  @get:Rule val taskExecutorRule = InstantTaskExecutorRule()
}