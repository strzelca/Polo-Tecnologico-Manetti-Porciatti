import requests
from colorama import Fore, Style

class UrlElements:
    def __init__(self, url):
        self.url = url

    def make_request(self):
        return requests.get(self.url)

    def print_status(self):
        code = self.make_request().status_code
        fmt_code = f"{Fore.GREEN}{Style.BRIGHT}{code}{Style.RESET_ALL}"
        print(f"Status code: {fmt_code}")

    def get(self):
        content = self.make_request().text
        fmt_content = f"{Fore.YELLOW}{Style.BRIGHT}{content}{Style.RESET_ALL}"
        print(f"Public IP: {fmt_content}")
