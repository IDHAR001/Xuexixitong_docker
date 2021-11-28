const menu = {
    list() {
        return [
    {
        "backMenu":[
            {
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"管理员管理",
                        "menuJump":"列表",
                        "tableName":"users"
                    }
                ],
                "menu":"管理员管理"
            }
			,{
			    "child":[
			        {
			            "buttons":[
			                "查看",
			                "新增",
			                "修改",
			                "删除"
			            ],
			            "menu":"教师管理",
			            "menuJump":"列表",
			            "tableName":"jiaoshi"
			        }
			    ],
			    "menu":"教师管理"
			}
			,{
			    "child":[
			        {
			            "buttons":[
			                "查看",
			                "新增",
			                "修改",
			                "删除"
			            ],
			            "menu":"学生管理",
			            "menuJump":"列表",
			            "tableName":"xuesheng"
			        }
			    ],
			    "menu":"学生管理"
			}
			,{
			    "child":[
			        {
			            "buttons":[
			                "查看",
			                "新增",
			                "修改",
			                "删除"
			            ],
			            "menu":"学习视频管理",
			            "menuJump":"列表",
			            "tableName":"xuexishipin"
			        }
			    ],
			    "menu":"学习视频管理"
			}
			,{
			    "child":[
			        {
			            "buttons":[
			                "查看",
			                "新增",
			                "修改",
			                "删除"
			            ],
			            "menu":"学习资料管理",
			            "menuJump":"列表",
			            "tableName":"xuexiziliao"
			        }
			    ],
			    "menu":"学习资料管理"
			}
			,{
			    "child":[
			        {
			            "buttons":[
			                "查看",
			                "新增",
			                "修改",
							"考勤",
			                "删除"
			            ],
			            "menu":"课程信息管理",
			            "menuJump":"列表",
			            "tableName":"kecheng"
			        },
					{
					    "buttons":[
					        "查看",
					        "删除"
					    ],
					    "menu":"课程考勤管理",
					    "menuJump":"列表",
					    "tableName":"kechnegkaoqin"
					},
					{
					    "buttons":[
					        "查看",
					        "审核",
					        "删除"
					    ],
					    "menu":"考勤请假管理",
					    "menuJump":"列表",
					    "tableName":"kaoqinqingjia"
					}
			    ],
			    "menu":"课程信息管理"
			}
			,{
				"child":[
					{
						"buttons":[
							"查看",
							"新增",
							"修改",
							"删除"
						],
						"menu":"试卷管理",
						"menuJump":"列表",
						"tableName":"exampaper"
					}
				],
				"menu":"试卷管理"
			}
			,{
				"child":[
					{
						"buttons":[
							"查看",
							"新增",
							"修改",
							"删除"
						],
						"menu":"试题管理",
						"menuJump":"列表",
						"tableName":"examquestion"
					}
				],
				"menu":"试题管理"
			}
			,{
				"child":[
					{
					"buttons":[
							"查看"
						],
						"menu":"试卷列表",
						"menuJump":"列表",
						"tableName":"exampaperlist"
					},
					{
						"buttons":[
							"查看",
							"批改",
							"删除"
						],
						"menu":"考试记录",
						"menuJump":"列表",
						"tableName":"examrecord"
					},
					{
						"buttons":[
							"查看",
							"删除"
						],
						"menu":"错题本",
						"menuJump":"列表",
						"tableName":"examrewrongquestion"
					}
				],
				"menu":"考试管理"
			}
			,{
			    "child":[
			       {
			           "buttons":[
			               "查看",
			               "新增",
			               "修改",
			               "删除"
			           ],
			           "menu":"课程作业管理",
			           "menuJump":"列表",
			           "tableName":"kechengzuoye"
			       }
			    ],
			    "menu":"课程作业管理"
			}
			,{
			    "child":[
			        {
			            "buttons":[
			                "查看",
			                "删除"
			            ],
			            "menu":"论坛管理",
			            "menuJump":"列表",
			            "tableName":"forum"
			        }
			    ],
			    "menu":"论坛管理"
			}
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"班级管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryBanji"
                    }
                    ,
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"帖子类型管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryForum"
                    }
                    ,
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"课程类型管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryKecheng"
                    }
            
                ],
                "menu":"基础数据管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"轮播图管理",
                        "menuJump":"列表",
                        "tableName":"config"
                    }
                ],
                "menu":"轮播图信息"
            }
        ],
        "frontMenu":[],
        "hasBackLogin":"是",
        "hasBackRegister":"否",
        "hasFrontLogin":"否",
        "hasFrontRegister":"否",
        "roleName":"管理员",
        "tableName":"users"
    },
	{
	        "backMenu":[
	            {
				    "child":[
				        {
				            "buttons":[
				                "查看"
				            ],
				            "menu":"学习视频管理",
				            "menuJump":"列表",
				            "tableName":"xuexishipin"
				        }
				    ],
				    "menu":"学习视频管理"
				}
				,{
				    "child":[
				        {
				            "buttons":[
				                "查看"
				            ],
				            "menu":"学习资料管理",
				            "menuJump":"列表",
				            "tableName":"xuexiziliao"
				        }
				    ],
				    "menu":"学习资料管理"
				}
				,{
				    "child":[
				        {
				            "buttons":[
				                "查看",
								"考勤"
				            ],
				            "menu":"课程信息管理",
				            "menuJump":"列表",
				            "tableName":"kecheng"
				        },
						{
						    "buttons":[
						        "查看",
						        "删除"
						    ],
						    "menu":"课程考勤管理",
						    "menuJump":"列表",
						    "tableName":"kechnegkaoqin"
						},
						{
						    "buttons":[
						        "查看",
						        "审核",
						        "删除"
						    ],
						    "menu":"考勤请假管理",
						    "menuJump":"列表",
						    "tableName":"kaoqinqingjia"
						}
				    ],
				    "menu":"课程信息管理"
				}
				,{
					"child":[
						{
							"buttons":[
								"查看",
								"新增",
								"修改",
								"删除"
							],
							"menu":"试卷管理",
							"menuJump":"列表",
							"tableName":"exampaper"
						}
					],
					"menu":"试卷管理"
				}
				,{
					"child":[
						{
							"buttons":[
								"查看",
								"新增",
								"修改",
								"删除"
							],
							"menu":"试题管理",
							"menuJump":"列表",
							"tableName":"examquestion"
						}
					],
					"menu":"试题管理"
				}
				,{
					"child":[
						{
						"buttons":[
								"查看"
							],
							"menu":"试卷列表",
							"menuJump":"列表",
							"tableName":"exampaperlist"
						},
						{
							"buttons":[
								"查看",
								"批改"
							],
							"menu":"考试记录",
							"menuJump":"列表",
							"tableName":"examrecord"
						},
						{
							"buttons":[
								"查看"
							],
							"menu":"错题本",
							"menuJump":"列表",
							"tableName":"examrewrongquestion"
						}
					],
					"menu":"考试管理"
				}
				,{
				    "child":[
				       {
				           "buttons":[
				               "查看",
				               "新增",
				               "修改",
				               "删除"
				           ],
				           "menu":"课程作业管理",
				           "menuJump":"列表",
				           "tableName":"kechengzuoye"
				       }
				    ],
				    "menu":"课程作业管理"
				}
	            ,{
	                "child":[
	                    {
	                        "buttons":[
	                            "查看"
	                        ],
	                        "menu":"班级管理",
	                        "menuJump":"列表",
	                        "tableName":"dictionaryBanji"
	                    }
	                    ,
	                    {
	                        "buttons":[
	                            "查看"
	                        ],
	                        "menu":"课程类型管理",
	                        "menuJump":"列表",
	                        "tableName":"dictionaryKecheng"
	                    }
	            
	                ],
	                "menu":"基础数据管理"
	            }
	        ],
	        "frontMenu":[],
	        "hasBackLogin":"是",
	        "hasBackRegister":"否",
	        "hasFrontLogin":"否",
	        "hasFrontRegister":"否",
	        "roleName":"教师",
	        "tableName":"jiaoshi"
	    },
		{
		    "backMenu":[
		        {
				    "child":[
				        {
				            "buttons":[
				                "查看"
				            ],
				            "menu":"学习视频管理",
				            "menuJump":"列表",
				            "tableName":"xuexishipin"
				        }
				    ],
				    "menu":"学习视频管理"
				}
				,{
				    "child":[
				        {
				            "buttons":[
				                "查看"
				            ],
				            "menu":"学习资料管理",
				            "menuJump":"列表",
				            "tableName":"xuexiziliao"
				        }
				    ],
				    "menu":"学习资料管理"
				}
				,{
				    "child":[
				        {
				            "buttons":[
				                "查看"
				            ],
				            "menu":"课程信息管理",
				            "menuJump":"列表",
				            "tableName":"kecheng"
				        },
						{
						    "buttons":[
						        "查看",
						        "打卡",
						        "请假"
						    ],
						    "menu":"课程考勤管理",
						    "menuJump":"列表",
						    "tableName":"kechnegkaoqin"
						},
						{
						    "buttons":[
						        "查看"
						    ],
						    "menu":"考勤请假管理",
						    "menuJump":"列表",
						    "tableName":"kaoqinqingjia"
						}
				    ],
				    "menu":"课程信息管理"
				}
				,{
					"child":[
						{
						"buttons":[
								"查看",
								"考试"
							],
							"menu":"试卷列表",
							"menuJump":"列表",
							"tableName":"exampaperlist"
						},
						{
							"buttons":[
								"查看"
							],
							"menu":"考试记录",
							"menuJump":"列表",
							"tableName":"examrecord"
						},
						{
							"buttons":[
								"查看"
							],
							"menu":"错题本",
							"menuJump":"列表",
							"tableName":"examrewrongquestion"
						}
					],
					"menu":"考试管理"
				}
				,{
				    "child":[
				       {
				           "buttons":[
				               "查看"
				           ],
				           "menu":"课程作业管理",
				           "menuJump":"列表",
				           "tableName":"kechengzuoye"
				       }
				    ],
				    "menu":"课程作业管理"
				}
		    ],
		    "frontMenu":[],
		    "hasBackLogin":"是",
		    "hasBackRegister":"否",
		    "hasFrontLogin":"否",
		    "hasFrontRegister":"否",
		    "roleName":"学生",
		    "tableName":"xuesheng"
		}
	
]
    }
}
export default menu;