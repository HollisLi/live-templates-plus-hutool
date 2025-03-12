# live-templates-plus-hutool

> An enhanced version of Idea live templates, with more popular templates, and support for the Hutool toolkits.<br/>
> Idea live templates 的增强版, 加入了更多常用的模板, 以及对 Hutool 工具包的支持.

## Live Templates Plus(Hutool)

[![Version](https://img.shields.io/jetbrains/plugin/v/24784-live-templates-plus-hutool-.svg)](https://plugins.jetbrains.com/plugin/24784-live-templates-plus-hutool-)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/24784-live-templates-plus-hutool-.svg)](https://plugins.jetbrains.com/plugin/24784-live-templates-plus-hutool-)

## Help Document

[Help Document | 帮助文档](https://www.wolai.com/haozhe/oMDRF7Rn6j4kVpgt8H8N9j)

## Live Templates Example | 模板示例

> For more Example, please refer to the help document <br/>
> 更多示例详情, 请看[帮助文档](https://www.wolai.com/haozhe/oMDRF7Rn6j4kVpgt8H8N9j)

### String

|            |                                    |
|------------|------------------------------------|
| Live Input | Hutool                             |
| strb       | StrUtil.isBlank(String)            |
| ifstrb     | if (StrUtil.isBlank(String)) {}    |
| strnb      | StrUtil.isNotBlank(String)         |
| ifstrnb    | if (StrUtil.isNotBlank(String)) {} |
| stre       | StrUtil.equals(str1, str2)         |
| ifstre     | if(StrUtil.equals(str1, str2)) {}  |
| strne      | !StrUtil.equals(str1, str2)        |
| ifstrne    | if(!StrUtil.equals(str1, str2)) {} |
| strf       | StrUtil.format(str, args...)       |

### Annotaion

|            |                                                                  |
|------------|------------------------------------------------------------------|
| Live Input | Automatic Completion                                             |
| slfj       | @Slf4j                                                           |
| logfj      | @Log4j2                                                          |
| restc      | @RestController                                                  |
| service    | @Service                                                         |
| mapper     | @Mapper                                                          |
| auto       | @Autowired                                                       |
| resource   | @Resource                                                        |
| reqm       | @RequestMapping("/")                                             |
| getm       | @GetMapping("/")                                                 |
| postm      | @PostMapping("/")                                                |
| putm       | @PutMapping("/"):                                                |
| delm       | @DeleteMapping("/")                                              |
| reqp       | @RequestParam("");                                               |
| reqb       | @RequestBody                                                     |
| allarg     | @AllArgsConstructor                                              |
| noarg      | @NoArgsConstructor                                               |
| reqarg     | @RequiredArgsConstructor                                         |
| data       | @Data                                                            |
| builder    | @Builder                                                         |
| getter     | @Getter                                                          |
| setter     | @Setter                                                          |
| tostring   | @ToString                                                        |
| enumv      | @EnumValue                                                       |
| clean      | @Cleanup                                                         |
| jsonfor    | @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8") |
| datefor    | @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")                 |
| validated  | @Validated                                                       |
| valid      | @Valid                                                           |
| notn       | @NotNull("")                                                     |
| notb       | @NotBlank("")                                                    |
| size       | @Size("")                                                        |
| length     | @Length("")                                                      |

### Installation

- Using the IDE built-in plugin system:

  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "Live Template Plus(Hutool)"</kbd> >
  <kbd>Install</kbd>

- Manually:

  Download the [latest release](https://github.com/HollisLi/live-templates-plus-hutool/releases/latest) and install it
  manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>

---
Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template

[docs:plugin-description]: https://plugins.jetbrains.com/docs/intellij/plugin-user-experience.html#plugin-description-and-presentation
